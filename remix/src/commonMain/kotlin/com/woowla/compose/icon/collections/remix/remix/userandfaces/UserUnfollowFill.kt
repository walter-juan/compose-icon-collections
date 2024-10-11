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

public val UserAndFacesGroup.UserUnfollowFill: ImageVector
    get() {
        if (_userUnfollowFill != null) {
            return _userUnfollowFill!!
        }
        _userUnfollowFill = Builder(name = "UserUnfollowFill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 14.252f)
                verticalLineTo(22.0f)
                horizontalLineTo(4.0f)
                curveTo(4.0f, 17.582f, 7.582f, 14.0f, 12.0f, 14.0f)
                curveTo(12.691f, 14.0f, 13.361f, 14.087f, 14.0f, 14.252f)
                close()
                moveTo(12.0f, 13.0f)
                curveTo(8.685f, 13.0f, 6.0f, 10.315f, 6.0f, 7.0f)
                curveTo(6.0f, 3.685f, 8.685f, 1.0f, 12.0f, 1.0f)
                curveTo(15.315f, 1.0f, 18.0f, 3.685f, 18.0f, 7.0f)
                curveTo(18.0f, 10.315f, 15.315f, 13.0f, 12.0f, 13.0f)
                close()
                moveTo(19.0f, 16.586f)
                lineTo(21.121f, 14.465f)
                lineTo(22.535f, 15.879f)
                lineTo(20.414f, 18.0f)
                lineTo(22.535f, 20.121f)
                lineTo(21.121f, 21.535f)
                lineTo(19.0f, 19.414f)
                lineTo(16.879f, 21.535f)
                lineTo(15.465f, 20.121f)
                lineTo(17.586f, 18.0f)
                lineTo(15.465f, 15.879f)
                lineTo(16.879f, 14.465f)
                lineTo(19.0f, 16.586f)
                close()
            }
        }
        .build()
        return _userUnfollowFill!!
    }

private var _userUnfollowFill: ImageVector? = null
