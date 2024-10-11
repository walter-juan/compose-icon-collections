package com.woowla.compose.icon.collections.remix.remix.business

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.BusinessGroup

public val BusinessGroup.ShakeHandsLine: ImageVector
    get() {
        if (_shakeHandsLine != null) {
            return _shakeHandsLine!!
        }
        _shakeHandsLine = Builder(name = "ShakeHandsLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.861f, 2.391f)
                curveTo(12.849f, 1.732f, 14.134f, 1.718f, 15.136f, 2.356f)
                lineTo(19.291f, 5.0f)
                horizontalLineTo(21.0f)
                curveTo(21.552f, 5.0f, 22.0f, 5.448f, 22.0f, 6.0f)
                verticalLineTo(15.0f)
                curveTo(22.0f, 15.552f, 21.552f, 16.0f, 21.0f, 16.0f)
                horizontalLineTo(19.48f)
                curveTo(19.54f, 16.947f, 19.093f, 17.91f, 18.195f, 18.449f)
                lineTo(13.102f, 21.505f)
                curveTo(12.459f, 21.891f, 11.661f, 21.882f, 11.031f, 21.497f)
                curveTo(10.331f, 22.117f, 9.253f, 22.185f, 8.471f, 21.57f)
                lineTo(3.33f, 17.531f)
                curveTo(2.564f, 16.929f, 2.37f, 15.9f, 2.766f, 15.085f)
                curveTo(2.282f, 14.706f, 2.0f, 14.125f, 2.0f, 13.511f)
                verticalLineTo(6.0f)
                curveTo(2.0f, 5.448f, 2.448f, 5.0f, 3.0f, 5.0f)
                horizontalLineTo(7.947f)
                lineTo(11.861f, 2.391f)
                close()
                moveTo(4.173f, 13.645f)
                lineTo(4.865f, 13.04f)
                curveTo(6.095f, 11.963f, 7.96f, 12.07f, 9.06f, 13.279f)
                lineTo(11.762f, 16.252f)
                curveTo(12.632f, 17.208f, 12.79f, 18.614f, 12.158f, 19.739f)
                lineTo(17.167f, 16.734f)
                curveTo(17.448f, 16.565f, 17.55f, 16.228f, 17.445f, 15.943f)
                lineTo(13.018f, 9.746f)
                curveTo(12.769f, 9.397f, 12.326f, 9.246f, 11.917f, 9.369f)
                lineTo(9.431f, 10.115f)
                curveTo(8.374f, 10.432f, 7.228f, 10.143f, 6.448f, 9.362f)
                lineTo(6.155f, 9.07f)
                curveTo(5.587f, 8.502f, 5.44f, 7.693f, 5.679f, 7.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(13.511f)
                lineTo(4.173f, 13.645f)
                close()
                moveTo(14.062f, 4.043f)
                curveTo(13.728f, 3.83f, 13.3f, 3.835f, 12.97f, 4.055f)
                lineTo(7.569f, 7.655f)
                lineTo(7.862f, 7.948f)
                curveTo(8.122f, 8.208f, 8.504f, 8.305f, 8.857f, 8.199f)
                lineTo(11.342f, 7.453f)
                curveTo(12.571f, 7.084f, 13.899f, 7.539f, 14.645f, 8.583f)
                lineTo(18.514f, 14.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(19.291f)
                curveTo(18.911f, 7.0f, 18.538f, 6.891f, 18.217f, 6.687f)
                lineTo(14.062f, 4.043f)
                close()
                moveTo(6.182f, 14.545f)
                lineTo(4.566f, 15.959f)
                lineTo(9.707f, 19.998f)
                lineTo(10.411f, 18.766f)
                curveTo(10.626f, 18.39f, 10.574f, 17.918f, 10.282f, 17.597f)
                lineTo(7.58f, 14.625f)
                curveTo(7.214f, 14.222f, 6.592f, 14.186f, 6.182f, 14.545f)
                close()
            }
        }
        .build()
        return _shakeHandsLine!!
    }

private var _shakeHandsLine: ImageVector? = null
