package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.CurrencyRupee: ImageVector
    get() {
        if (_currencyRupee != null) {
            return _currencyRupee!!
        }
        _currencyRupee = Builder(name = "CurrencyRupee", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 3.06f)
                horizontalLineToRelative(2.726f)
                curveToRelative(1.22f, 0.0f, 2.12f, 0.575f, 2.325f, 1.724f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(1.051f)
                horizontalLineToRelative(5.051f)
                curveTo(8.855f, 7.001f, 8.0f, 7.558f, 6.788f, 7.558f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(1.317f)
                lineTo(8.437f, 14.0f)
                horizontalLineToRelative(2.11f)
                lineTo(6.095f, 8.884f)
                horizontalLineToRelative(0.855f)
                curveToRelative(2.316f, -0.018f, 3.465f, -1.476f, 3.688f, -3.049f)
                horizontalLineTo(12.0f)
                verticalLineTo(4.784f)
                horizontalLineToRelative(-1.345f)
                curveToRelative(-0.08f, -0.778f, -0.357f, -1.335f, -0.793f, -1.732f)
                horizontalLineTo(12.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _currencyRupee!!
    }

private var _currencyRupee: ImageVector? = null
