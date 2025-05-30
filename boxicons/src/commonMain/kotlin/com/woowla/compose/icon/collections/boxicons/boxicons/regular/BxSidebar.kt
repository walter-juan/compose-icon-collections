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

public val RegularGroup.BxSidebar: ImageVector
    get() {
        if (_bxSidebar != null) {
            return _bxSidebar!!
        }
        _bxSidebar = Builder(name = "BxSidebar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 3.0f)
                lineTo(4.0f, 3.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                lineTo(22.0f, 5.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(4.0f, 19.0f)
                lineTo(4.0f, 7.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(12.0f)
                lineTo(4.0f, 19.0f)
                close()
                moveTo(12.0f, 19.0f)
                lineTo(12.0f, 7.0f)
                horizontalLineToRelative(8.0f)
                lineTo(20.0f, 5.0f)
                lineToRelative(0.002f, 14.0f)
                lineTo(12.0f, 19.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 10.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                lineTo(6.0f, 12.0f)
                close()
                moveTo(6.0f, 14.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                lineTo(6.0f, 16.0f)
                close()
            }
        }
        .build()
        return _bxSidebar!!
    }

private var _bxSidebar: ImageVector? = null
