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

public val Twbs.SkipEnd: ImageVector
    get() {
        if (_skipEnd != null) {
            return _skipEnd!!
        }
        _skipEnd = Builder(name = "SkipEnd", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.5f, 4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -1.0f, 0.0f)
                verticalLineToRelative(3.248f)
                lineTo(5.233f, 3.612f)
                curveTo(4.713f, 3.31f, 4.0f, 3.655f, 4.0f, 4.308f)
                verticalLineToRelative(7.384f)
                curveToRelative(0.0f, 0.653f, 0.713f, 0.998f, 1.233f, 0.696f)
                lineTo(11.5f, 8.752f)
                verticalLineTo(12.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 1.0f, 0.0f)
                close()
                moveTo(5.0f, 4.633f)
                lineTo(10.804f, 8.0f)
                lineTo(5.0f, 11.367f)
                close()
            }
        }
        .build()
        return _skipEnd!!
    }

private var _skipEnd: ImageVector? = null
