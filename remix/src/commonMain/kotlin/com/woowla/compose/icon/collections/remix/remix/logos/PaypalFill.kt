package com.woowla.compose.icon.collections.remix.remix.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.LogosGroup

public val LogosGroup.PaypalFill: ImageVector
    get() {
        if (_paypalFill != null) {
            return _paypalFill!!
        }
        _paypalFill = Builder(name = "PaypalFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.067f, 8.478f)
                curveTo(20.559f, 9.358f, 20.624f, 10.492f, 20.368f, 11.805f)
                curveTo(19.627f, 15.611f, 17.092f, 16.925f, 13.854f, 16.925f)
                horizontalLineTo(13.354f)
                curveTo(12.958f, 16.925f, 12.622f, 17.214f, 12.56f, 17.605f)
                lineTo(12.519f, 17.825f)
                lineTo(11.89f, 21.818f)
                lineTo(11.857f, 21.988f)
                curveTo(11.795f, 22.379f, 11.458f, 22.667f, 11.063f, 22.667f)
                horizontalLineTo(7.72f)
                curveTo(7.424f, 22.667f, 7.197f, 22.402f, 7.243f, 22.109f)
                lineTo(7.418f, 21.0f)
                horizontalLineTo(8.937f)
                lineTo(9.886f, 14.979f)
                horizontalLineTo(11.272f)
                curveTo(15.95f, 14.979f, 19.021f, 12.777f, 20.067f, 8.478f)
                close()
                moveTo(17.107f, 3.388f)
                curveTo(17.869f, 4.256f, 18.091f, 5.199f, 17.86f, 6.673f)
                curveTo(17.84f, 6.796f, 17.82f, 6.914f, 17.797f, 7.033f)
                curveTo(17.062f, 10.806f, 14.709f, 12.479f, 10.842f, 12.479f)
                horizontalLineTo(8.957f)
                curveTo(8.326f, 12.479f, 7.784f, 12.893f, 7.604f, 13.481f)
                lineTo(7.589f, 13.479f)
                lineTo(6.66f, 19.373f)
                horizontalLineTo(3.122f)
                curveTo(3.09f, 19.373f, 3.066f, 19.345f, 3.071f, 19.314f)
                lineTo(5.669f, 2.802f)
                curveTo(5.742f, 2.34f, 6.14f, 2.0f, 6.608f, 2.0f)
                horizontalLineTo(12.583f)
                curveTo(14.766f, 2.0f, 16.3f, 2.469f, 17.107f, 3.388f)
                close()
            }
        }
        .build()
        return _paypalFill!!
    }

private var _paypalFill: ImageVector? = null
