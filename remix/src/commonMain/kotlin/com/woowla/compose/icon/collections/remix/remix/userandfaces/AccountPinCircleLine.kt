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

public val UserAndFacesGroup.AccountPinCircleLine: ImageVector
    get() {
        if (_accountPinCircleLine != null) {
            return _accountPinCircleLine!!
        }
        _accountPinCircleLine = Builder(name = "AccountPinCircleLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.745f, 21.745f)
                curveTo(5.308f, 20.722f, 2.0f, 16.747f, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                curveTo(22.0f, 16.747f, 18.692f, 20.722f, 14.255f, 21.745f)
                lineTo(12.0f, 24.0f)
                lineTo(9.745f, 21.745f)
                close()
                moveTo(7.012f, 18.257f)
                curveTo(7.924f, 18.986f, 9.004f, 19.521f, 10.194f, 19.796f)
                lineTo(10.753f, 19.925f)
                lineTo(12.0f, 21.172f)
                lineTo(13.247f, 19.925f)
                lineTo(13.806f, 19.796f)
                curveTo(15.075f, 19.503f, 16.218f, 18.914f, 17.168f, 18.109f)
                curveTo(15.896f, 16.808f, 14.123f, 16.0f, 12.16f, 16.0f)
                curveTo(10.124f, 16.0f, 8.291f, 16.869f, 7.012f, 18.257f)
                close()
                moveTo(5.616f, 16.821f)
                curveTo(7.256f, 15.084f, 9.581f, 14.0f, 12.16f, 14.0f)
                curveTo(14.644f, 14.0f, 16.893f, 15.007f, 18.522f, 16.634f)
                curveTo(19.456f, 15.318f, 20.0f, 13.714f, 20.0f, 12.0f)
                curveTo(20.0f, 7.582f, 16.418f, 4.0f, 12.0f, 4.0f)
                curveTo(7.582f, 4.0f, 4.0f, 7.582f, 4.0f, 12.0f)
                curveTo(4.0f, 13.796f, 4.597f, 15.472f, 5.616f, 16.821f)
                close()
                moveTo(12.0f, 13.0f)
                curveTo(9.791f, 13.0f, 8.0f, 11.209f, 8.0f, 9.0f)
                curveTo(8.0f, 6.791f, 9.791f, 5.0f, 12.0f, 5.0f)
                curveTo(14.209f, 5.0f, 16.0f, 6.791f, 16.0f, 9.0f)
                curveTo(16.0f, 11.209f, 14.209f, 13.0f, 12.0f, 13.0f)
                close()
                moveTo(12.0f, 11.0f)
                curveTo(13.105f, 11.0f, 14.0f, 10.105f, 14.0f, 9.0f)
                curveTo(14.0f, 7.895f, 13.105f, 7.0f, 12.0f, 7.0f)
                curveTo(10.895f, 7.0f, 10.0f, 7.895f, 10.0f, 9.0f)
                curveTo(10.0f, 10.105f, 10.895f, 11.0f, 12.0f, 11.0f)
                close()
            }
        }
        .build()
        return _accountPinCircleLine!!
    }

private var _accountPinCircleLine: ImageVector? = null
