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

public val RegularGroup.BxBaguette: ImageVector
    get() {
        if (_bxBaguette != null) {
            return _bxBaguette!!
        }
        _bxBaguette = Builder(name = "BxBaguette", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.64f, 21.71f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.6f, -2.47f)
                lineToRelative(6.0f, -6.0f)
                curveToRelative(2.87f, -2.87f, 3.31f, -7.11f, 1.0f, -9.45f)
                reflectiveCurveToRelative(-6.58f, -1.91f, -9.45f, 1.0f)
                lineToRelative(-6.0f, 6.0f)
                curveToRelative(-2.87f, 2.87f, -3.31f, 7.11f, -1.0f, 9.45f)
                arcToRelative(5.38f, 5.38f, 0.0f, false, false, 3.85f, 1.47f)
                close()
                moveTo(5.64f, 12.71f)
                lineTo(8.42f, 15.5f)
                lineTo(9.84f, 14.08f)
                lineTo(7.05f, 11.29f)
                lineTo(8.46f, 9.88f)
                lineTo(11.29f, 12.71f)
                lineTo(12.71f, 11.29f)
                lineTo(9.88f, 8.46f)
                lineTo(11.29f, 7.05f)
                lineTo(14.12f, 9.88f)
                lineTo(15.54f, 8.46f)
                lineTo(12.75f, 5.68f)
                curveToRelative(2.0f, -1.61f, 4.65f, -1.87f, 6.0f, -0.47f)
                reflectiveCurveToRelative(1.09f, 4.56f, -1.0f, 6.62f)
                lineToRelative(-6.0f, 6.0f)
                curveToRelative(-2.06f, 2.05f, -5.09f, 2.5f, -6.62f, 1.0f)
                reflectiveCurveToRelative(-1.06f, -4.07f, 0.55f, -6.08f)
                close()
            }
        }
        .build()
        return _bxBaguette!!
    }

private var _bxBaguette: ImageVector? = null
