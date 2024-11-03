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

public val Twbs.Android: ImageVector
    get() {
        if (_android != null) {
            return _android!!
        }
        _android = Builder(name = "Android", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.76f, 3.061f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.679f, 0.2f)
                lineToRelative(1.283f, 2.352f)
                arcTo(8.9f, 8.9f, 0.0f, false, true, 8.0f, 5.0f)
                arcToRelative(8.9f, 8.9f, 0.0f, false, true, 3.278f, 0.613f)
                lineToRelative(1.283f, -2.352f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.878f, 0.478f)
                lineToRelative(-1.252f, 2.295f)
                curveTo(14.475f, 7.266f, 16.0f, 9.477f, 16.0f, 12.0f)
                horizontalLineTo(0.0f)
                curveToRelative(0.0f, -2.523f, 1.525f, -4.734f, 3.813f, -5.966f)
                lineTo(2.56f, 3.74f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.2f, -0.678f)
                close()
                moveTo(5.0f, 10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                moveToRelative(6.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
            }
        }
        .build()
        return _android!!
    }

private var _android: ImageVector? = null
