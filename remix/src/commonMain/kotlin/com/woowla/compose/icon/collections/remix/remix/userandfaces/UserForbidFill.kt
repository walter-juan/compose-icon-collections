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

public val UserAndFacesGroup.UserForbidFill: ImageVector
    get() {
        if (_userForbidFill != null) {
            return _userForbidFill!!
        }
        _userForbidFill = Builder(name = "UserForbidFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 13.0f)
                curveTo(15.314f, 13.0f, 18.0f, 10.314f, 18.0f, 7.0f)
                curveTo(18.0f, 3.686f, 15.314f, 1.0f, 12.0f, 1.0f)
                curveTo(8.686f, 1.0f, 6.0f, 3.686f, 6.0f, 7.0f)
                curveTo(6.0f, 10.314f, 8.686f, 13.0f, 12.0f, 13.0f)
                close()
                moveTo(15.0f, 18.0f)
                curveTo(15.0f, 16.343f, 16.343f, 15.0f, 18.0f, 15.0f)
                curveTo(18.463f, 15.0f, 18.902f, 15.105f, 19.293f, 15.292f)
                lineTo(15.292f, 19.293f)
                curveTo(15.105f, 18.902f, 15.0f, 18.463f, 15.0f, 18.0f)
                close()
                moveTo(16.707f, 20.708f)
                lineTo(20.708f, 16.707f)
                curveTo(20.895f, 17.098f, 21.0f, 17.537f, 21.0f, 18.0f)
                curveTo(21.0f, 19.657f, 19.657f, 21.0f, 18.0f, 21.0f)
                curveTo(17.537f, 21.0f, 17.098f, 20.895f, 16.707f, 20.708f)
                close()
                moveTo(18.0f, 13.0f)
                curveTo(15.239f, 13.0f, 13.0f, 15.239f, 13.0f, 18.0f)
                curveTo(13.0f, 20.761f, 15.239f, 23.0f, 18.0f, 23.0f)
                curveTo(20.761f, 23.0f, 23.0f, 20.761f, 23.0f, 18.0f)
                curveTo(23.0f, 15.239f, 20.761f, 13.0f, 18.0f, 13.0f)
                close()
                moveTo(12.0f, 14.0f)
                curveTo(12.084f, 14.0f, 12.168f, 14.001f, 12.252f, 14.004f)
                curveTo(11.463f, 15.137f, 11.0f, 16.514f, 11.0f, 18.0f)
                curveTo(11.0f, 19.487f, 11.464f, 20.866f, 12.255f, 22.0f)
                horizontalLineTo(4.0f)
                curveTo(4.0f, 17.582f, 7.582f, 14.0f, 12.0f, 14.0f)
                close()
            }
        }
        .build()
        return _userForbidFill!!
    }

private var _userForbidFill: ImageVector? = null
