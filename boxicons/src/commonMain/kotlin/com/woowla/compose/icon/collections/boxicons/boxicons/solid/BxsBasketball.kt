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

public val SolidGroup.BxsBasketball: ImageVector
    get() {
        if (_bxsBasketball != null) {
            return _bxsBasketball!!
        }
        _bxsBasketball = Builder(name = "BxsBasketball", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.328f, 4.258f)
                arcToRelative(9.953f, 9.953f, 0.0f, false, false, -5.949f, -2.235f)
                arcToRelative(8.99f, 8.99f, 0.0f, false, true, -1.835f, 7.107f)
                lineTo(12.0f, 10.586f)
                lineToRelative(6.328f, -6.328f)
                close()
                moveTo(7.701f, 9.115f)
                lineTo(4.258f, 5.672f)
                arcToRelative(9.938f, 9.938f, 0.0f, false, false, -2.112f, 4.704f)
                arcToRelative(7.007f, 7.007f, 0.0f, false, false, 5.555f, -1.261f)
                close()
                moveTo(19.742f, 5.672f)
                lineTo(13.414f, 12.0f)
                lineToRelative(1.456f, 1.456f)
                arcToRelative(8.993f, 8.993f, 0.0f, false, true, 7.107f, -1.835f)
                arcToRelative(9.953f, 9.953f, 0.0f, false, false, -2.235f, -5.949f)
                close()
                moveTo(21.854f, 13.624f)
                arcToRelative(7.007f, 7.007f, 0.0f, false, false, -5.555f, 1.261f)
                lineToRelative(3.443f, 3.443f)
                arcToRelative(9.924f, 9.924f, 0.0f, false, false, 2.112f, -4.704f)
                close()
                moveTo(9.115f, 7.701f)
                arcToRelative(7.007f, 7.007f, 0.0f, false, false, 1.261f, -5.555f)
                arcToRelative(9.928f, 9.928f, 0.0f, false, false, -4.704f, 2.112f)
                lineToRelative(3.443f, 3.443f)
                close()
                moveTo(13.624f, 21.854f)
                arcToRelative(9.936f, 9.936f, 0.0f, false, false, 4.704f, -2.111f)
                lineTo(14.885f, 16.3f)
                arcToRelative(7.003f, 7.003f, 0.0f, false, false, -1.261f, 5.554f)
                close()
                moveTo(12.0f, 13.414f)
                lineToRelative(-6.328f, 6.328f)
                arcToRelative(9.953f, 9.953f, 0.0f, false, false, 5.949f, 2.235f)
                arcToRelative(8.99f, 8.99f, 0.0f, false, true, 1.835f, -7.107f)
                lineTo(12.0f, 13.414f)
                close()
                moveTo(4.258f, 18.328f)
                lineTo(10.586f, 12.0f)
                lineTo(9.13f, 10.544f)
                arcToRelative(8.993f, 8.993f, 0.0f, false, true, -7.107f, 1.835f)
                arcToRelative(9.953f, 9.953f, 0.0f, false, false, 2.235f, 5.949f)
                close()
            }
        }
        .build()
        return _bxsBasketball!!
    }

private var _bxsBasketball: ImageVector? = null
