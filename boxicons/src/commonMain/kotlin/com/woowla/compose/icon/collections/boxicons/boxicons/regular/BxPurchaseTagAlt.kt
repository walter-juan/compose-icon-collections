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

public val RegularGroup.BxPurchaseTagAlt: ImageVector
    get() {
        if (_bxPurchaseTagAlt != null) {
            return _bxPurchaseTagAlt!!
        }
        _bxPurchaseTagAlt = Builder(name = "BxPurchaseTagAlt", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.707f, 2.293f)
                arcTo(0.997f, 0.997f, 0.0f, false, false, 11.0f, 2.0f)
                horizontalLineTo(6.0f)
                arcToRelative(0.997f, 0.997f, 0.0f, false, false, -0.707f, 0.293f)
                lineToRelative(-3.0f, 3.0f)
                arcTo(0.996f, 0.996f, 0.0f, false, false, 2.0f, 6.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 0.266f, 0.105f, 0.52f, 0.293f, 0.707f)
                lineToRelative(10.0f, 10.0f)
                arcToRelative(0.997f, 0.997f, 0.0f, false, false, 1.414f, 0.0f)
                lineToRelative(8.0f, -8.0f)
                arcToRelative(0.999f, 0.999f, 0.0f, false, false, 0.0f, -1.414f)
                lineToRelative(-10.0f, -10.0f)
                close()
                moveTo(13.0f, 19.586f)
                lineToRelative(-9.0f, -9.0f)
                verticalLineTo(6.414f)
                lineTo(6.414f, 4.0f)
                horizontalLineToRelative(4.172f)
                lineToRelative(9.0f, 9.0f)
                lineTo(13.0f, 19.586f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.353f, 8.353f)
                moveToRelative(-1.647f, 0.0f)
                arcToRelative(1.647f, 1.647f, 0.0f, true, true, 3.294f, 0.0f)
                arcToRelative(1.647f, 1.647f, 0.0f, true, true, -3.294f, 0.0f)
            }
        }
        .build()
        return _bxPurchaseTagAlt!!
    }

private var _bxPurchaseTagAlt: ImageVector? = null
