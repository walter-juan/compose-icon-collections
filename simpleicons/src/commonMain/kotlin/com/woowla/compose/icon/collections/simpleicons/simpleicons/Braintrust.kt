package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Braintrust: ImageVector
    get() {
        if (_braintrust != null) {
            return _braintrust!!
        }
        _braintrust = Builder(name = "Braintrust", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 12.002f)
                curveTo(0.0f, 5.372f, 5.374f, -0.002f, 12.001f, -0.002f)
                curveTo(18.626f, -0.002f, 24.0f, 5.372f, 24.0f, 12.002f)
                curveToRelative(0.0f, 6.625f, -5.374f, 12.0f, -11.999f, 12.0f)
                horizontalLineToRelative(-9.98f)
                arcToRelative(2.01f, 2.01f, 0.0f, false, true, -2.013f, -2.013f)
                lineTo(0.008f, 12.01f)
                close()
                moveTo(0.0f, 12.002f)
            }
        }
        .build()
        return _braintrust!!
    }

private var _braintrust: ImageVector? = null
