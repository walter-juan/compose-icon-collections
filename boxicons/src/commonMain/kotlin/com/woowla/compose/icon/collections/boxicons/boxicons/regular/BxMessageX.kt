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

public val RegularGroup.BxMessageX: ImageVector
    get() {
        if (_bxMessageX != null) {
            return _bxMessageX!!
        }
        _bxMessageX = Builder(name = "BxMessageX", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 2.0f)
                lineTo(4.0f, 2.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.767f)
                lineTo(13.277f, 18.0f)
                lineTo(20.0f, 18.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                lineTo(22.0f, 4.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(20.0f, 16.0f)
                horizontalLineToRelative(-7.277f)
                lineTo(9.0f, 18.233f)
                lineTo(9.0f, 16.0f)
                lineTo(4.0f, 16.0f)
                lineTo(4.0f, 4.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.707f, 13.707f)
                lineTo(12.0f, 11.414f)
                lineToRelative(2.293f, 2.293f)
                lineToRelative(1.414f, -1.414f)
                lineTo(13.414f, 10.0f)
                lineToRelative(2.293f, -2.293f)
                lineToRelative(-1.414f, -1.414f)
                lineTo(12.0f, 8.586f)
                lineTo(9.707f, 6.293f)
                lineTo(8.293f, 7.707f)
                lineTo(10.586f, 10.0f)
                lineToRelative(-2.293f, 2.293f)
                close()
            }
        }
        .build()
        return _bxMessageX!!
    }

private var _bxMessageX: ImageVector? = null
