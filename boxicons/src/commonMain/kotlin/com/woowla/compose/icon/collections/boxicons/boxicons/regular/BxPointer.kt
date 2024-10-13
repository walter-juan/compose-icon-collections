package com.woowla.compose.icon.collections.boxicons.boxicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.RegularGroup

public val RegularGroup.BxPointer: ImageVector
    get() {
        if (_bxPointer != null) {
            return _bxPointer!!
        }
        _bxPointer = Builder(name = "BxPointer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.978f, 13.21f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.396f, -1.024f)
                lineToRelative(-14.0f, -10.0f)
                arcToRelative(0.999f, 0.999f, 0.0f, false, false, -1.575f, 0.931f)
                lineToRelative(2.0f, 17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.767f, 0.516f)
                lineToRelative(3.612f, -4.416f)
                lineToRelative(3.377f, 5.46f)
                lineToRelative(1.701f, -1.052f)
                lineToRelative(-3.357f, -5.428f)
                lineToRelative(6.089f, -1.218f)
                arcToRelative(0.995f, 0.995f, 0.0f, false, false, 0.782f, -0.769f)
                close()
                moveTo(12.304f, 13.52f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.578f, 0.347f)
                lineToRelative(-3.008f, 3.677f)
                lineTo(7.257f, 5.127f)
                lineToRelative(10.283f, 7.345f)
                lineToRelative(-5.236f, 1.048f)
                close()
            }
        }
        .build()
        return _bxPointer!!
    }

private var _bxPointer: ImageVector? = null
