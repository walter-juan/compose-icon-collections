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

public val Twbs.Lightning: ImageVector
    get() {
        if (_lightning != null) {
            return _lightning!!
        }
        _lightning = Builder(name = "Lightning", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.52f, 0.359f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 6.0f, 0.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.474f, 0.658f)
                lineTo(8.694f, 6.0f)
                horizontalLineTo(12.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.395f, 0.807f)
                lineToRelative(-7.0f, 9.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.873f, -0.454f)
                lineTo(6.823f, 9.5f)
                horizontalLineTo(3.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.48f, -0.641f)
                close()
                moveTo(6.374f, 1.0f)
                lineTo(4.168f, 8.5f)
                horizontalLineTo(7.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.478f, 0.647f)
                lineTo(6.78f, 13.04f)
                lineTo(11.478f, 7.0f)
                horizontalLineTo(8.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.474f, -0.658f)
                lineTo(9.306f, 1.0f)
                close()
            }
        }
        .build()
        return _lightning!!
    }

private var _lightning: ImageVector? = null
