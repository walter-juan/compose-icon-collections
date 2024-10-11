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

public val UserAndFacesGroup.AccountPinBoxLine: ImageVector
    get() {
        if (_accountPinBoxLine != null) {
            return _accountPinBoxLine!!
        }
        _accountPinBoxLine = Builder(name = "AccountPinBoxLine", defaultWidth = 24.0.dp,
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
                moveTo(19.0f, 19.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(10.828f)
                lineTo(12.0f, 20.172f)
                lineTo(13.172f, 19.0f)
                horizontalLineTo(19.0f)
                close()
                moveTo(7.972f, 18.181f)
                curveTo(7.353f, 17.913f, 6.767f, 17.584f, 6.221f, 17.202f)
                curveTo(7.468f, 15.275f, 9.636f, 14.0f, 12.102f, 14.0f)
                curveTo(14.502f, 14.0f, 16.619f, 15.207f, 17.88f, 17.047f)
                curveTo(17.344f, 17.444f, 16.766f, 17.788f, 16.156f, 18.072f)
                curveTo(15.247f, 16.817f, 13.77f, 16.0f, 12.102f, 16.0f)
                curveTo(10.387f, 16.0f, 8.873f, 16.864f, 7.972f, 18.181f)
                close()
                moveTo(12.0f, 13.0f)
                curveTo(10.067f, 13.0f, 8.5f, 11.433f, 8.5f, 9.5f)
                curveTo(8.5f, 7.567f, 10.067f, 6.0f, 12.0f, 6.0f)
                curveTo(13.933f, 6.0f, 15.5f, 7.567f, 15.5f, 9.5f)
                curveTo(15.5f, 11.433f, 13.933f, 13.0f, 12.0f, 13.0f)
                close()
                moveTo(12.0f, 11.0f)
                curveTo(12.828f, 11.0f, 13.5f, 10.328f, 13.5f, 9.5f)
                curveTo(13.5f, 8.672f, 12.828f, 8.0f, 12.0f, 8.0f)
                curveTo(11.172f, 8.0f, 10.5f, 8.672f, 10.5f, 9.5f)
                curveTo(10.5f, 10.328f, 11.172f, 11.0f, 12.0f, 11.0f)
                close()
            }
        }
        .build()
        return _accountPinBoxLine!!
    }

private var _accountPinBoxLine: ImageVector? = null
