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

public val SolidGroup.BxsPurchaseTagAlt: ImageVector
    get() {
        if (_bxsPurchaseTagAlt != null) {
            return _bxsPurchaseTagAlt!!
        }
        _bxsPurchaseTagAlt = Builder(name = "BxsPurchaseTagAlt", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.707f, 2.293f)
                arcTo(0.996f, 0.996f, 0.0f, false, false, 11.0f, 2.0f)
                horizontalLineTo(6.0f)
                arcToRelative(0.996f, 0.996f, 0.0f, false, false, -0.707f, 0.293f)
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
                moveTo(8.353f, 10.0f)
                arcToRelative(1.647f, 1.647f, 0.0f, true, true, -0.001f, -3.293f)
                arcTo(1.647f, 1.647f, 0.0f, false, true, 8.353f, 10.0f)
                close()
            }
        }
        .build()
        return _bxsPurchaseTagAlt!!
    }

private var _bxsPurchaseTagAlt: ImageVector? = null
