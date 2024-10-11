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

public val UserAndFacesGroup.UserLocationLine: ImageVector
    get() {
        if (_userLocationLine != null) {
            return _userLocationLine!!
        }
        _userLocationLine = Builder(name = "UserLocationLine", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 14.0f)
                verticalLineTo(16.0f)
                curveTo(8.686f, 16.0f, 6.0f, 18.686f, 6.0f, 22.0f)
                horizontalLineTo(4.0f)
                curveTo(4.0f, 17.582f, 7.582f, 14.0f, 12.0f, 14.0f)
                close()
                moveTo(12.0f, 13.0f)
                curveTo(8.685f, 13.0f, 6.0f, 10.315f, 6.0f, 7.0f)
                curveTo(6.0f, 3.685f, 8.685f, 1.0f, 12.0f, 1.0f)
                curveTo(15.315f, 1.0f, 18.0f, 3.685f, 18.0f, 7.0f)
                curveTo(18.0f, 10.315f, 15.315f, 13.0f, 12.0f, 13.0f)
                close()
                moveTo(12.0f, 11.0f)
                curveTo(14.21f, 11.0f, 16.0f, 9.21f, 16.0f, 7.0f)
                curveTo(16.0f, 4.79f, 14.21f, 3.0f, 12.0f, 3.0f)
                curveTo(9.79f, 3.0f, 8.0f, 4.79f, 8.0f, 7.0f)
                curveTo(8.0f, 9.21f, 9.79f, 11.0f, 12.0f, 11.0f)
                close()
                moveTo(20.828f, 21.071f)
                lineTo(18.0f, 24.0f)
                lineTo(15.172f, 21.071f)
                curveTo(13.609f, 19.454f, 13.609f, 16.831f, 15.172f, 15.213f)
                curveTo(16.734f, 13.596f, 19.266f, 13.596f, 20.828f, 15.213f)
                curveTo(22.39f, 16.831f, 22.39f, 19.454f, 20.828f, 21.071f)
                close()
                moveTo(19.39f, 19.682f)
                curveTo(20.203f, 18.839f, 20.203f, 17.445f, 19.39f, 16.603f)
                curveTo(18.614f, 15.799f, 17.386f, 15.799f, 16.61f, 16.603f)
                curveTo(15.797f, 17.445f, 15.797f, 18.839f, 16.61f, 19.682f)
                lineTo(18.0f, 21.121f)
                lineTo(19.39f, 19.682f)
                close()
            }
        }
        .build()
        return _userLocationLine!!
    }

private var _userLocationLine: ImageVector? = null
