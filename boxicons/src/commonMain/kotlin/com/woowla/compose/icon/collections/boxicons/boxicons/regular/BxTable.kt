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

public val RegularGroup.BxTable: ImageVector
    get() {
        if (_bxTable != null) {
            return _bxTable!!
        }
        _bxTable = Builder(name = "BxTable", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 21.0f)
                horizontalLineToRelative(15.893f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                lineTo(21.893f, 5.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                lineTo(4.0f, 3.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                close()
                moveTo(4.0f, 19.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(5.0f)
                lineTo(4.0f, 19.0f)
                close()
                moveTo(14.0f, 7.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(10.0f, 7.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(8.0f, 7.0f)
                verticalLineToRelative(5.0f)
                lineTo(4.0f, 12.0f)
                lineTo(4.0f, 7.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(10.0f, 19.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-4.0f)
                close()
                moveTo(16.0f, 19.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(3.894f)
                verticalLineToRelative(5.0f)
                lineTo(16.0f, 19.0f)
                close()
                moveTo(19.893f, 12.0f)
                lineTo(16.0f, 12.0f)
                lineTo(16.0f, 7.0f)
                horizontalLineToRelative(3.893f)
                verticalLineToRelative(5.0f)
                close()
            }
        }
        .build()
        return _bxTable!!
    }

private var _bxTable: ImageVector? = null
