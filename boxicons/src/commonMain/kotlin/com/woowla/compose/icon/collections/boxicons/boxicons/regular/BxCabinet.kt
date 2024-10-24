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

public val RegularGroup.BxCabinet: ImageVector
    get() {
        if (_bxCabinet != null) {
            return _bxCabinet!!
        }
        _bxCabinet = Builder(name = "BxCabinet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 4.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                lineTo(5.0f, 2.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                lineTo(21.0f, 4.0f)
                close()
                moveTo(5.0f, 4.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(7.0f)
                lineTo(5.0f, 11.0f)
                lineTo(5.0f, 4.0f)
                close()
                moveTo(5.0f, 20.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(14.001f)
                verticalLineToRelative(7.0f)
                lineTo(5.0f, 20.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 7.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(10.0f, 6.0f)
                lineTo(8.0f, 6.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(8.0f)
                lineTo(16.0f, 6.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(14.0f, 15.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-1.0f)
                lineTo(8.0f, 15.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-3.0f)
                close()
            }
        }
        .build()
        return _bxCabinet!!
    }

private var _bxCabinet: ImageVector? = null