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

public val RegularGroup.BxCodeBlock: ImageVector
    get() {
        if (_bxCodeBlock != null) {
            return _bxCodeBlock!!
        }
        _bxCodeBlock = Builder(name = "BxCodeBlock", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 3.0f)
                horizontalLineTo(4.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                verticalLineTo(5.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(4.0f, 19.0f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(16.0f)
                lineToRelative(0.002f, 12.0f)
                horizontalLineTo(4.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.293f, 9.293f)
                lineTo(5.586f, 13.0f)
                lineToRelative(3.707f, 3.707f)
                lineToRelative(1.414f, -1.414f)
                lineTo(8.414f, 13.0f)
                lineToRelative(2.293f, -2.293f)
                close()
                moveTo(14.707f, 9.293f)
                lineTo(13.293f, 10.707f)
                lineTo(15.586f, 13.0f)
                lineToRelative(-2.293f, 2.293f)
                lineToRelative(1.414f, 1.414f)
                lineTo(18.414f, 13.0f)
                close()
            }
        }
        .build()
        return _bxCodeBlock!!
    }

private var _bxCodeBlock: ImageVector? = null
