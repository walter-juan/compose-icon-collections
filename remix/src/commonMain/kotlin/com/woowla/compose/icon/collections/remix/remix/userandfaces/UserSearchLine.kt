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

public val UserAndFacesGroup.UserSearchLine: ImageVector
    get() {
        if (_userSearchLine != null) {
            return _userSearchLine!!
        }
        _userSearchLine = Builder(name = "UserSearchLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(21.446f, 20.032f)
                lineTo(22.95f, 21.535f)
                lineTo(21.535f, 22.95f)
                lineTo(20.032f, 21.446f)
                curveTo(19.437f, 21.798f, 18.742f, 22.0f, 18.0f, 22.0f)
                curveTo(15.791f, 22.0f, 14.0f, 20.209f, 14.0f, 18.0f)
                curveTo(14.0f, 15.791f, 15.791f, 14.0f, 18.0f, 14.0f)
                curveTo(20.209f, 14.0f, 22.0f, 15.791f, 22.0f, 18.0f)
                curveTo(22.0f, 18.742f, 21.798f, 19.437f, 21.446f, 20.032f)
                close()
                moveTo(18.0f, 20.0f)
                curveTo(19.105f, 20.0f, 20.0f, 19.105f, 20.0f, 18.0f)
                curveTo(20.0f, 16.895f, 19.105f, 16.0f, 18.0f, 16.0f)
                curveTo(16.895f, 16.0f, 16.0f, 16.895f, 16.0f, 18.0f)
                curveTo(16.0f, 19.105f, 16.895f, 20.0f, 18.0f, 20.0f)
                close()
            }
        }
        .build()
        return _userSearchLine!!
    }

private var _userSearchLine: ImageVector? = null
