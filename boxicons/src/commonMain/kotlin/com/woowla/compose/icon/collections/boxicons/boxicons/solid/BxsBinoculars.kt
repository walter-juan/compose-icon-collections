package com.woowla.compose.icon.collections.boxicons.boxicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.SolidGroup

public val SolidGroup.BxsBinoculars: ImageVector
    get() {
        if (_bxsBinoculars != null) {
            return _bxsBinoculars!!
        }
        _bxsBinoculars = Builder(name = "BxsBinoculars", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.447f, 5.345f)
                arcTo(3.27f, 3.27f, 0.0f, false, false, 16.29f, 3.0f)
                arcToRelative(3.293f, 3.293f, 0.0f, false, false, -3.277f, 3.0f)
                horizontalLineToRelative(-2.025f)
                arcToRelative(3.297f, 3.297f, 0.0f, false, false, -3.284f, -3.0f)
                arcToRelative(3.268f, 3.268f, 0.0f, false, false, -3.151f, 2.345f)
                lineToRelative(-2.511f, 8.368f)
                arcTo(1.027f, 1.027f, 0.0f, false, false, 2.0f, 14.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.001f, 5.0f)
                arcToRelative(5.003f, 5.003f, 0.0f, false, false, 4.576f, -3.0f)
                horizontalLineToRelative(0.846f)
                arcToRelative(5.003f, 5.003f, 0.0f, false, false, 4.576f, 3.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, false, 22.0f, 14.999f)
                lineTo(22.0f, 14.0f)
                curveToRelative(0.0f, -0.098f, -0.015f, -0.194f, -0.042f, -0.287f)
                lineToRelative(-2.511f, -8.368f)
                close()
                moveTo(7.001f, 18.0f)
                arcTo(3.005f, 3.005f, 0.0f, false, true, 4.0f, 15.0f)
                curveToRelative(0.0f, -0.076f, 0.017f, -0.147f, 0.022f, -0.222f)
                arcTo(2.995f, 2.995f, 0.0f, false, true, 7.0f, 12.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                verticalLineToRelative(0.009f)
                arcTo(3.004f, 3.004f, 0.0f, false, true, 7.001f, 18.0f)
                close()
                moveTo(16.999f, 18.0f)
                arcTo(3.004f, 3.004f, 0.0f, false, true, 14.0f, 15.009f)
                lineTo(14.0f, 15.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 6.0f, -0.001f)
                arcTo(3.005f, 3.005f, 0.0f, false, true, 16.999f, 18.0f)
                close()
            }
        }
        .build()
        return _bxsBinoculars!!
    }

private var _bxsBinoculars: ImageVector? = null
