package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.AlignTop: ImageVector
    get() {
        if (_alignTop != null) {
            return _alignTop!!
        }
        _alignTop = Builder(name = "AlignTop", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 15.0f)
                lineTo(9.0f, 15.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 10.0f, 14.0f)
                lineTo(10.0f, 4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 9.0f, 3.0f)
                lineTo(7.0f, 3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.0f, 4.0f)
                lineTo(6.0f, 14.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 7.0f, 15.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.5f, 2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
                close()
                moveTo(14.5f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                close()
                moveTo(1.5f, 1.0f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-13.0f)
                close()
            }
        }
        .build()
        return _alignTop!!
    }

private var _alignTop: ImageVector? = null
