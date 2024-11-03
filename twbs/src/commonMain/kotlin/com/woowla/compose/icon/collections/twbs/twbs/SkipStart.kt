package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.SkipStart: ImageVector
    get() {
        if (_skipStart != null) {
            return _skipStart!!
        }
        _skipStart = Builder(name = "SkipStart", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 1.0f, 0.0f)
                verticalLineToRelative(3.248f)
                lineToRelative(6.267f, -3.636f)
                curveToRelative(0.52f, -0.302f, 1.233f, 0.043f, 1.233f, 0.696f)
                verticalLineToRelative(7.384f)
                curveToRelative(0.0f, 0.653f, -0.713f, 0.998f, -1.233f, 0.696f)
                lineTo(5.0f, 8.752f)
                lineTo(5.0f, 12.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -1.0f, 0.0f)
                close()
                moveTo(11.5f, 4.633f)
                lineTo(5.696f, 8.0f)
                lineToRelative(5.804f, 3.367f)
                close()
            }
        }
        .build()
        return _skipStart!!
    }

private var _skipStart: ImageVector? = null
