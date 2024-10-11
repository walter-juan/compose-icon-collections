package com.woowla.compose.icon.collections.remix.remix.userandfaces

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.UserAndFacesGroup

public val UserAndFacesGroup.GroupLine: ImageVector
    get() {
        if (_groupLine != null) {
            return _groupLine!!
        }
        _groupLine = Builder(name = "GroupLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 22.0f)
                curveTo(2.0f, 17.582f, 5.582f, 14.0f, 10.0f, 14.0f)
                curveTo(14.418f, 14.0f, 18.0f, 17.582f, 18.0f, 22.0f)
                horizontalLineTo(16.0f)
                curveTo(16.0f, 18.686f, 13.314f, 16.0f, 10.0f, 16.0f)
                curveTo(6.686f, 16.0f, 4.0f, 18.686f, 4.0f, 22.0f)
                horizontalLineTo(2.0f)
                close()
                moveTo(10.0f, 13.0f)
                curveTo(6.685f, 13.0f, 4.0f, 10.315f, 4.0f, 7.0f)
                curveTo(4.0f, 3.685f, 6.685f, 1.0f, 10.0f, 1.0f)
                curveTo(13.315f, 1.0f, 16.0f, 3.685f, 16.0f, 7.0f)
                curveTo(16.0f, 10.315f, 13.315f, 13.0f, 10.0f, 13.0f)
                close()
                moveTo(10.0f, 11.0f)
                curveTo(12.21f, 11.0f, 14.0f, 9.21f, 14.0f, 7.0f)
                curveTo(14.0f, 4.79f, 12.21f, 3.0f, 10.0f, 3.0f)
                curveTo(7.79f, 3.0f, 6.0f, 4.79f, 6.0f, 7.0f)
                curveTo(6.0f, 9.21f, 7.79f, 11.0f, 10.0f, 11.0f)
                close()
                moveTo(18.284f, 14.703f)
                curveTo(21.064f, 15.956f, 23.0f, 18.752f, 23.0f, 22.0f)
                horizontalLineTo(21.0f)
                curveTo(21.0f, 19.564f, 19.548f, 17.467f, 17.463f, 16.527f)
                lineTo(18.284f, 14.703f)
                close()
                moveTo(17.596f, 3.413f)
                curveTo(19.594f, 4.237f, 21.0f, 6.204f, 21.0f, 8.5f)
                curveTo(21.0f, 11.37f, 18.804f, 13.725f, 16.0f, 13.978f)
                verticalLineTo(11.965f)
                curveTo(17.697f, 11.722f, 19.0f, 10.264f, 19.0f, 8.5f)
                curveTo(19.0f, 7.119f, 18.202f, 5.926f, 17.041f, 5.356f)
                lineTo(17.596f, 3.413f)
                close()
            }
        }
        .build()
        return _groupLine!!
    }

private var _groupLine: ImageVector? = null
