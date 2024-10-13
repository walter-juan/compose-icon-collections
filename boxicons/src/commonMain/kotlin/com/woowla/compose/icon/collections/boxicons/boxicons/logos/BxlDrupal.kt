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

public val LogosGroup.BxlDrupal: ImageVector
    get() {
        if (_bxlDrupal != null) {
            return _bxlDrupal!!
        }
        _bxlDrupal = Builder(name = "BxlDrupal", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.474f, 14.42f)
                arcToRelative(3.162f, 3.162f, 0.0f, true, false, 0.0f, 6.324f)
                arcToRelative(3.162f, 3.162f, 0.0f, false, false, 0.0f, -6.324f)
                close()
                moveTo(15.41f, 13.814f)
                arcToRelative(5.433f, 5.433f, 0.0f, false, true, 1.513f, 3.769f)
                arcToRelative(5.441f, 5.441f, 0.0f, false, true, -2.335f, 4.47f)
                curveToRelative(2.609f, -0.803f, 4.771f, -2.767f, 5.737f, -5.142f)
                curveToRelative(1.338f, -3.288f, 0.09f, -5.761f, -1.999f, -8.005f)
                curveToRelative(0.066f, 0.288f, 0.103f, 0.592f, 0.103f, 0.898f)
                arcToRelative(4.175f, 4.175f, 0.0f, false, true, -3.019f, 4.01f)
                close()
                moveTo(11.833f, 9.811f)
                curveToRelative(0.0f, 1.34f, 1.087f, 2.419f, 2.42f, 2.419f)
                reflectiveCurveToRelative(2.423f, -1.087f, 2.423f, -2.419f)
                arcToRelative(2.418f, 2.418f, 0.0f, false, false, -2.417f, -2.417f)
                arcToRelative(2.425f, 2.425f, 0.0f, false, false, -2.426f, 2.417f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.303f, 21.093f)
                arcToRelative(5.435f, 5.435f, 0.0f, false, true, -1.276f, -3.51f)
                arcToRelative(5.441f, 5.441f, 0.0f, false, true, 4.8f, -5.408f)
                arcToRelative(4.162f, 4.162f, 0.0f, false, true, 3.99f, -6.492f)
                curveToRelative(-1.361f, -1.176f, -2.724f, -2.369f, -3.799f, -3.672f)
                curveToRelative(0.547f, 5.714f, -5.2f, 3.638f, -7.332f, 8.904f)
                curveToRelative(-1.422f, 3.527f, -0.138f, 7.892f, 3.617f, 10.178f)
                close()
            }
        }
        .build()
        return _bxlDrupal!!
    }

private var _bxlDrupal: ImageVector? = null
