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

public val RegularGroup.BxColumns: ImageVector
    get() {
        if (_bxColumns != null) {
            return _bxColumns!!
        }
        _bxColumns = Builder(name = "BxColumns", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.893f, 3.001f)
                lineTo(4.0f, 3.001f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(15.893f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                lineTo(21.893f, 5.0f)
                arcToRelative(2.003f, 2.003f, 0.0f, false, false, -2.0f, -1.999f)
                close()
                moveTo(8.0f, 19.001f)
                lineTo(4.0f, 19.001f)
                lineTo(4.0f, 8.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(11.001f)
                close()
                moveTo(14.0f, 19.001f)
                horizontalLineToRelative(-4.0f)
                lineTo(10.0f, 8.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(11.001f)
                close()
                moveTo(16.0f, 19.001f)
                lineTo(16.0f, 8.0f)
                horizontalLineToRelative(3.893f)
                lineToRelative(0.001f, 11.001f)
                lineTo(16.0f, 19.001f)
                close()
            }
        }
        .build()
        return _bxColumns!!
    }

private var _bxColumns: ImageVector? = null
