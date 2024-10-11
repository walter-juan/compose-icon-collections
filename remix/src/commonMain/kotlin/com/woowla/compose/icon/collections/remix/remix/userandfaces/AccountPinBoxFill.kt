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

public val UserAndFacesGroup.AccountPinBoxFill: ImageVector
    get() {
        if (_accountPinBoxFill != null) {
            return _accountPinBoxFill!!
        }
        _accountPinBoxFill = Builder(name = "AccountPinBoxFill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 21.0f)
                lineTo(12.0f, 23.0f)
                lineTo(10.0f, 21.0f)
                horizontalLineTo(4.995f)
                curveTo(3.893f, 21.0f, 3.0f, 20.107f, 3.0f, 19.005f)
                verticalLineTo(4.995f)
                curveTo(3.0f, 3.893f, 3.893f, 3.0f, 4.995f, 3.0f)
                horizontalLineTo(19.005f)
                curveTo(20.107f, 3.0f, 21.0f, 3.893f, 21.0f, 4.995f)
                verticalLineTo(19.005f)
                curveTo(21.0f, 20.107f, 20.107f, 21.0f, 19.005f, 21.0f)
                horizontalLineTo(14.0f)
                close()
                moveTo(6.357f, 18.0f)
                horizontalLineTo(17.847f)
                curveTo(16.583f, 16.187f, 14.481f, 15.0f, 12.102f, 15.0f)
                curveTo(9.723f, 15.0f, 7.622f, 16.187f, 6.357f, 18.0f)
                close()
                moveTo(12.0f, 13.0f)
                curveTo(13.933f, 13.0f, 15.5f, 11.433f, 15.5f, 9.5f)
                curveTo(15.5f, 7.567f, 13.933f, 6.0f, 12.0f, 6.0f)
                curveTo(10.067f, 6.0f, 8.5f, 7.567f, 8.5f, 9.5f)
                curveTo(8.5f, 11.433f, 10.067f, 13.0f, 12.0f, 13.0f)
                close()
            }
        }
        .build()
        return _accountPinBoxFill!!
    }

private var _accountPinBoxFill: ImageVector? = null
