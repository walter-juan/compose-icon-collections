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

public val UserAndFacesGroup.AccountPinCircleFill: ImageVector
    get() {
        if (_accountPinCircleFill != null) {
            return _accountPinCircleFill!!
        }
        _accountPinCircleFill = Builder(name = "AccountPinCircleFill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.256f, 21.744f)
                lineTo(12.0f, 24.0f)
                lineTo(9.744f, 21.744f)
                curveTo(5.309f, 20.72f, 2.0f, 16.744f, 2.0f, 12.0f)
                curveTo(2.0f, 6.48f, 6.48f, 2.0f, 12.0f, 2.0f)
                curveTo(17.52f, 2.0f, 22.0f, 6.48f, 22.0f, 12.0f)
                curveTo(22.0f, 16.744f, 18.691f, 20.72f, 14.256f, 21.744f)
                close()
                moveTo(6.023f, 15.416f)
                curveTo(7.491f, 17.607f, 9.695f, 19.0f, 12.16f, 19.0f)
                curveTo(14.624f, 19.0f, 16.829f, 17.607f, 18.296f, 15.416f)
                curveTo(16.688f, 13.917f, 14.531f, 13.0f, 12.16f, 13.0f)
                curveTo(9.788f, 13.0f, 7.631f, 13.917f, 6.023f, 15.416f)
                close()
                moveTo(12.0f, 11.0f)
                curveTo(13.657f, 11.0f, 15.0f, 9.657f, 15.0f, 8.0f)
                curveTo(15.0f, 6.343f, 13.657f, 5.0f, 12.0f, 5.0f)
                curveTo(10.343f, 5.0f, 9.0f, 6.343f, 9.0f, 8.0f)
                curveTo(9.0f, 9.657f, 10.343f, 11.0f, 12.0f, 11.0f)
                close()
            }
        }
        .build()
        return _accountPinCircleFill!!
    }

private var _accountPinCircleFill: ImageVector? = null
