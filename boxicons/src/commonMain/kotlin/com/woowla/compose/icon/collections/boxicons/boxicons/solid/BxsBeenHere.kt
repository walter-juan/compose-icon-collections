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

public val SolidGroup.BxsBeenHere: ImageVector
    get() {
        if (_bxsBeenHere != null) {
            return _bxsBeenHere!!
        }
        _bxsBeenHere = Builder(name = "BxsBeenHere", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(7.589f, 2.0f, 4.0f, 5.589f, 4.0f, 9.995f)
                curveTo(3.971f, 16.44f, 11.696f, 21.784f, 12.0f, 22.0f)
                curveToRelative(0.0f, 0.0f, 8.029f, -5.56f, 8.0f, -12.0f)
                curveToRelative(0.0f, -4.411f, -3.589f, -8.0f, -8.0f, -8.0f)
                close()
                moveTo(11.0f, 15.414f)
                lineTo(7.293f, 11.707f)
                lineTo(8.707f, 10.293f)
                lineTo(11.0f, 12.586f)
                lineToRelative(5.293f, -5.293f)
                lineToRelative(1.414f, 1.414f)
                lineTo(11.0f, 15.414f)
                close()
            }
        }
        .build()
        return _bxsBeenHere!!
    }

private var _bxsBeenHere: ImageVector? = null
