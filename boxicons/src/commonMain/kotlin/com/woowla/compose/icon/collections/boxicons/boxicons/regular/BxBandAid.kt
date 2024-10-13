package com.woowla.compose.icon.collections.boxicons.boxicons.regular

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
import com.woowla.compose.icon.collections.boxicons.boxicons.RegularGroup

public val RegularGroup.BxBandAid: ImageVector
    get() {
        if (_bxBandAid != null) {
            return _bxBandAid!!
        }
        _bxBandAid = Builder(name = "BxBandAid", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.111f, 21.889f)
                arcToRelative(5.962f, 5.962f, 0.0f, false, false, 4.242f, -1.757f)
                lineToRelative(7.778f, -7.778f)
                arcToRelative(6.007f, 6.007f, 0.0f, false, false, 0.0f, -8.485f)
                arcToRelative(5.965f, 5.965f, 0.0f, false, false, -4.243f, -1.757f)
                arcToRelative(5.962f, 5.962f, 0.0f, false, false, -4.242f, 1.757f)
                lineToRelative(-7.778f, 7.778f)
                arcToRelative(6.007f, 6.007f, 0.0f, false, false, 0.0f, 8.485f)
                arcToRelative(5.965f, 5.965f, 0.0f, false, false, 4.243f, 1.757f)
                close()
                moveTo(5.282f, 13.061f)
                lineTo(13.06f, 5.283f)
                arcToRelative(3.976f, 3.976f, 0.0f, false, true, 2.828f, -1.171f)
                curveToRelative(1.069f, 0.0f, 2.073f, 0.416f, 2.829f, 1.171f)
                arcToRelative(4.006f, 4.006f, 0.0f, false, true, 0.0f, 5.657f)
                lineToRelative(-7.778f, 7.778f)
                arcToRelative(3.976f, 3.976f, 0.0f, false, true, -2.828f, 1.171f)
                arcToRelative(3.977f, 3.977f, 0.0f, false, true, -2.829f, -1.171f)
                arcToRelative(4.008f, 4.008f, 0.0f, false, true, 0.0f, -5.657f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 12.0f)
                moveToRelative(-1.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 12.0f)
                moveToRelative(-1.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 15.0f)
                moveToRelative(-1.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 9.0f)
                moveToRelative(-1.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
            }
        }
        .build()
        return _bxBandAid!!
    }

private var _bxBandAid: ImageVector? = null
