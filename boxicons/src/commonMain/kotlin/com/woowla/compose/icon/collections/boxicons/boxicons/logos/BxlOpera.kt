package com.woowla.compose.icon.collections.boxicons.boxicons.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.LogosGroup

public val LogosGroup.BxlOpera: ImageVector
    get() {
        if (_bxlOpera != null) {
            return _bxlOpera!!
        }
        _bxlOpera = Builder(name = "BxlOpera", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.71f, 6.366f)
                curveTo(7.604f, 7.67f, 6.888f, 9.602f, 6.838f, 11.765f)
                verticalLineToRelative(0.471f)
                curveToRelative(0.05f, 2.165f, 0.766f, 4.094f, 1.872f, 5.397f)
                curveToRelative(1.434f, 1.865f, 3.564f, 3.046f, 5.948f, 3.046f)
                arcToRelative(7.218f, 7.218f, 0.0f, false, false, 4.006f, -1.225f)
                arcToRelative(9.943f, 9.943f, 0.0f, false, true, -7.139f, 2.533f)
                arcTo(9.995f, 9.995f, 0.0f, false, true, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.478f, 2.0f, 12.0f, 2.0f)
                horizontalLineToRelative(0.038f)
                arcToRelative(9.971f, 9.971f, 0.0f, false, true, 6.627f, 2.545f)
                curveToRelative(-1.173f, -0.773f, -2.543f, -1.225f, -4.009f, -1.225f)
                curveToRelative(-2.382f, 0.0f, -4.514f, 1.184f, -5.95f, 3.046f)
                horizontalLineToRelative(0.004f)
                close()
                moveTo(22.0f, 12.0f)
                arcToRelative(9.971f, 9.971f, 0.0f, false, true, -3.335f, 7.455f)
                curveToRelative(-2.564f, 1.25f, -4.954f, 0.375f, -5.747f, -0.172f)
                curveToRelative(2.52f, -0.553f, 4.422f, -3.6f, 4.422f, -7.283f)
                curveToRelative(0.0f, -3.686f, -1.901f, -6.73f, -4.422f, -7.283f)
                curveToRelative(0.792f, -0.545f, 3.183f, -1.42f, 5.747f, -0.172f)
                arcTo(9.971f, 9.971f, 0.0f, false, true, 22.0f, 12.0f)
                close()
            }
        }
        .build()
        return _bxlOpera!!
    }

private var _bxlOpera: ImageVector? = null
