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

public val SolidGroup.BxsTired: ImageVector
    get() {
        if (_bxsTired != null) {
            return _bxsTired!!
        }
        _bxsTired = Builder(name = "BxsTired", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.486f, 2.0f, 2.0f, 6.486f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.486f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.486f, 10.0f, -10.0f)
                reflectiveCurveTo(17.514f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(5.553f, 11.105f)
                lineTo(8.012f, 9.876f)
                lineTo(6.445f, 8.832f)
                lineTo(7.554f, 7.168f)
                lineTo(10.554f, 9.168f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.108f, 1.727f)
                lineToRelative(-4.0f, 2.0f)
                lineToRelative(-0.893f, -1.79f)
                close()
                moveTo(8.0f, 17.0f)
                reflectiveCurveToRelative(1.0f, -3.0f, 4.0f, -3.0f)
                reflectiveCurveToRelative(4.0f, 3.0f, 4.0f, 3.0f)
                lineTo(8.0f, 17.0f)
                close()
                moveTo(17.553f, 12.895f)
                lineTo(13.553f, 10.895f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.108f, -1.727f)
                lineToRelative(3.0f, -2.0f)
                lineToRelative(1.109f, 1.664f)
                lineToRelative(-1.566f, 1.044f)
                lineToRelative(2.459f, 1.229f)
                lineToRelative(-0.894f, 1.79f)
                close()
            }
        }
        .build()
        return _bxsTired!!
    }

private var _bxsTired: ImageVector? = null
