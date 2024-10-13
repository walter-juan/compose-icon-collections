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

public val SolidGroup.BxsBandAid: ImageVector
    get() {
        if (_bxsBandAid != null) {
            return _bxsBandAid!!
        }
        _bxsBandAid = Builder(name = "BxsBandAid", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.646f, 3.868f)
                lineToRelative(-7.778f, 7.778f)
                arcToRelative(6.007f, 6.007f, 0.0f, false, false, 0.0f, 8.485f)
                arcToRelative(5.984f, 5.984f, 0.0f, false, false, 4.242f, 1.754f)
                arcToRelative(5.984f, 5.984f, 0.0f, false, false, 4.243f, -1.754f)
                lineToRelative(7.778f, -7.778f)
                arcToRelative(6.007f, 6.007f, 0.0f, false, false, 0.0f, -8.485f)
                arcToRelative(6.008f, 6.008f, 0.0f, false, false, -8.485f, 0.0f)
                close()
                moveTo(9.0f, 13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                close()
                moveTo(12.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                close()
                moveTo(12.0f, 10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                close()
                moveTo(15.0f, 13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                close()
            }
        }
        .build()
        return _bxsBandAid!!
    }

private var _bxsBandAid: ImageVector? = null
