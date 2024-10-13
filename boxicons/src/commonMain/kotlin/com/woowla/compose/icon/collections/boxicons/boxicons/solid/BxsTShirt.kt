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

public val SolidGroup.BxsTShirt: ImageVector
    get() {
        if (_bxsTShirt != null) {
            return _bxsTShirt!!
        }
        _bxsTShirt = Builder(name = "BxsTShirt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.316f, 4.055f)
                curveTo(19.556f, 3.478f, 15.0f, 1.985f, 15.0f, 2.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -6.0f, 0.0f)
                curveToRelative(0.0f, -0.015f, -4.556f, 1.478f, -6.317f, 2.055f)
                arcTo(0.992f, 0.992f, 0.0f, false, false, 2.0f, 5.003f)
                verticalLineToRelative(3.716f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.242f, 0.97f)
                lineTo(6.0f, 9.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineTo(9.0f)
                lineToRelative(2.758f, 0.689f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 22.0f, 8.719f)
                verticalLineTo(5.003f)
                arcToRelative(0.992f, 0.992f, 0.0f, false, false, -0.684f, -0.948f)
                close()
            }
        }
        .build()
        return _bxsTShirt!!
    }

private var _bxsTShirt: ImageVector? = null
