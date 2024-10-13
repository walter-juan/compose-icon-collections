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

public val RegularGroup.BxCrown: ImageVector
    get() {
        if (_bxCrown != null) {
            return _bxCrown!!
        }
        _bxCrown = Builder(name = "BxCrown", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.219f, 3.375f)
                lineTo(8.0f, 7.399f)
                lineTo(4.781f, 3.375f)
                arcTo(1.002f, 1.002f, 0.0f, false, false, 3.0f, 4.0f)
                verticalLineToRelative(15.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                lineTo(21.0f, 4.0f)
                arcToRelative(1.002f, 1.002f, 0.0f, false, false, -1.781f, -0.625f)
                lineTo(16.0f, 7.399f)
                lineToRelative(-3.219f, -4.024f)
                curveToRelative(-0.381f, -0.474f, -1.181f, -0.474f, -1.562f, 0.0f)
                close()
                moveTo(5.0f, 19.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(14.001f)
                verticalLineToRelative(2.0f)
                lineTo(5.0f, 19.0f)
                close()
                moveTo(15.219f, 9.625f)
                curveToRelative(0.381f, 0.475f, 1.182f, 0.475f, 1.563f, 0.0f)
                lineTo(19.0f, 6.851f)
                lineTo(19.001f, 15.0f)
                lineTo(5.0f, 15.0f)
                lineTo(5.0f, 6.851f)
                lineToRelative(2.219f, 2.774f)
                curveToRelative(0.381f, 0.475f, 1.182f, 0.475f, 1.563f, 0.0f)
                lineTo(12.0f, 5.601f)
                lineToRelative(3.219f, 4.024f)
                close()
            }
        }
        .build()
        return _bxCrown!!
    }

private var _bxCrown: ImageVector? = null
