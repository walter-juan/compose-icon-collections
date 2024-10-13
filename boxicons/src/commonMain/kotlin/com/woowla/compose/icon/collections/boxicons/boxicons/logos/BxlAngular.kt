package com.woowla.compose.icon.collections.boxicons.boxicons.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.LogosGroup

public val LogosGroup.BxlAngular: ImageVector
    get() {
        if (_bxlAngular != null) {
            return _bxlAngular!!
        }
        _bxlAngular = Builder(name = "BxlAngular", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.483f, 12.482f)
                horizontalLineToRelative(3.034f)
                lineTo(12.0f, 8.831f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.074f)
                lineTo(3.689f, 6.038f)
                lineToRelative(1.268f, 10.987f)
                lineToRelative(7.043f, 3.9f)
                lineToRelative(7.043f, -3.9f)
                lineToRelative(1.268f, -10.987f)
                lineTo(12.0f, 3.074f)
                close()
                moveTo(17.187f, 16.695f)
                lineTo(15.25f, 16.695f)
                lineToRelative(-1.045f, -2.606f)
                horizontalLineToRelative(-4.41f)
                lineTo(8.75f, 16.695f)
                lineTo(6.813f, 16.695f)
                lineTo(12.0f, 5.047f)
                lineToRelative(5.187f, 11.648f)
                close()
            }
        }
        .build()
        return _bxlAngular!!
    }

private var _bxlAngular: ImageVector? = null
