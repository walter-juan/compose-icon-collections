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

public val RegularGroup.BxRename: ImageVector
    get() {
        if (_bxRename != null) {
            return _bxRename!!
        }
        _bxRename = Builder(name = "BxRename", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.005f, 5.995f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                verticalLineToRelative(-8.0f)
                curveToRelative(0.0f, -1.102f, -0.898f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(6.005f, 9.995f)
                lineTo(15.0f, 9.995f)
                verticalLineToRelative(4.0f)
                lineTo(6.005f, 13.995f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.005f, 17.995f)
                lineTo(17.005f, 4.0f)
                lineTo(20.0f, 4.0f)
                lineTo(20.0f, 2.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.005f)
                verticalLineToRelative(1.995f)
                horizontalLineToRelative(-11.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(11.0f)
                lineTo(15.005f, 20.0f)
                lineTo(12.0f, 20.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.995f)
                verticalLineToRelative(-2.005f)
                close()
                moveTo(4.005f, 15.995f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-11.0f)
                close()
            }
        }
        .build()
        return _bxRename!!
    }

private var _bxRename: ImageVector? = null
