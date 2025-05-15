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

public val Twbs.FlaskFlorence: ImageVector
    get() {
        if (_flaskFlorence != null) {
            return _flaskFlorence!!
        }
        _flaskFlorence = Builder(name = "FlaskFlorence", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.5f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(5.416f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, false, 4.0f, 0.0f)
                verticalLineTo(1.0f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                close()
                moveTo(9.0f, 2.0f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                horizontalLineTo(9.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                horizontalLineTo(9.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                horizontalLineToRelative(0.564f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.27f, 0.227f)
                arcTo(4.002f, 4.002f, 0.0f, false, true, 8.0f, 15.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.333f, -7.773f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.333f, -0.47f)
                verticalLineTo(1.0f)
                horizontalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _flaskFlorence!!
    }

private var _flaskFlorence: ImageVector? = null
