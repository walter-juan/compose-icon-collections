package com.woowla.compose.icon.collections.boxicons.boxicons.logos

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
import com.woowla.compose.icon.collections.boxicons.boxicons.LogosGroup

public val LogosGroup.BxlAudible: ImageVector
    get() {
        if (_bxlAudible != null) {
            return _bxlAudible!!
        }
        _bxlAudible = Builder(name = "BxlAudible", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.005f, 10.238f)
                verticalLineToRelative(1.69f)
                lineToRelative(10.002f, 6.254f)
                lineToRelative(9.988f, -6.254f)
                verticalLineToRelative(-1.69f)
                lineToRelative(-9.988f, 6.229f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.938f, 12.469f)
                lineToRelative(1.465f, -0.938f)
                curveToRelative(-1.161f, -1.701f, -3.153f, -2.876f, -5.396f, -2.876f)
                curveToRelative(-2.257f, 0.0f, -4.236f, 1.135f, -5.371f, 2.89f)
                curveToRelative(0.093f, -0.093f, 0.146f, -0.146f, 0.238f, -0.211f)
                curveToRelative(2.811f, -2.336f, 6.86f, -1.808f, 9.064f, 1.135f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.051f, 13.063f)
                arcToRelative(2.99f, 2.99f, 0.0f, false, true, 1.78f, -0.58f)
                curveToRelative(1.083f, 0.0f, 2.047f, 0.554f, 2.692f, 1.49f)
                lineToRelative(1.399f, -0.871f)
                curveToRelative(-0.607f, -0.963f, -1.688f, -1.557f, -2.916f, -1.557f)
                curveToRelative(-1.226f, 0.0f, -2.309f, 0.62f, -2.955f, 1.518f)
                close()
                moveTo(5.25f, 9.012f)
                curveToRelative(4.117f, -3.246f, 9.937f, -2.362f, 13.037f, 1.953f)
                lineToRelative(0.026f, 0.026f)
                lineToRelative(1.517f, -0.938f)
                arcToRelative(9.337f, 9.337f, 0.0f, false, false, -7.823f, -4.235f)
                arcToRelative(9.35f, 9.35f, 0.0f, false, false, -7.825f, 4.235f)
                curveToRelative(0.304f, -0.342f, 0.686f, -0.751f, 1.068f, -1.041f)
                close()
            }
        }
        .build()
        return _bxlAudible!!
    }

private var _bxlAudible: ImageVector? = null
