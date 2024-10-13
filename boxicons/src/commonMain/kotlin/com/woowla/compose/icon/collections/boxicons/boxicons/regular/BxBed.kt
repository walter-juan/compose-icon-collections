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

public val RegularGroup.BxBed: ImageVector
    get() {
        if (_bxBed != null) {
            return _bxBed!!
        }
        _bxBed = Builder(name = "BxBed", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 9.557f)
                lineTo(20.0f, 3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                lineTo(6.0f, 5.0f)
                lineTo(6.0f, 3.0f)
                lineTo(4.0f, 3.0f)
                verticalLineToRelative(6.557f)
                curveTo(2.81f, 10.25f, 2.0f, 11.525f, 2.0f, 13.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -1.475f, -0.811f, -2.75f, -2.0f, -3.443f)
                close()
                moveTo(18.0f, 7.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-5.0f)
                lineTo(13.0f, 7.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(6.0f, 7.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(2.0f)
                lineTo(6.0f, 9.0f)
                lineTo(6.0f, 7.0f)
                close()
                moveTo(20.0f, 16.0f)
                lineTo(4.0f, 16.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                verticalLineToRelative(3.0f)
                close()
            }
        }
        .build()
        return _bxBed!!
    }

private var _bxBed: ImageVector? = null
