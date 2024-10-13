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

public val LogosGroup.BxlFigma: ImageVector
    get() {
        if (_bxlFigma != null) {
            return _bxlFigma!!
        }
        _bxlFigma = Builder(name = "BxlFigma", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.332f, 8.668f)
                arcToRelative(3.333f, 3.333f, 0.0f, false, false, 0.0f, -6.663f)
                horizontalLineTo(8.668f)
                arcToRelative(3.333f, 3.333f, 0.0f, false, false, 0.0f, 6.663f)
                arcToRelative(3.333f, 3.333f, 0.0f, false, false, 0.0f, 6.665f)
                arcToRelative(3.333f, 3.333f, 0.0f, false, false, 0.0f, 6.664f)
                arcTo(3.334f, 3.334f, 0.0f, false, false, 12.0f, 18.664f)
                verticalLineTo(8.668f)
                horizontalLineToRelative(3.332f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.332f, 12.0f)
                moveToRelative(-3.332f, 0.0f)
                arcToRelative(3.332f, 3.332f, 0.0f, true, true, 6.664f, 0.0f)
                arcToRelative(3.332f, 3.332f, 0.0f, true, true, -6.664f, 0.0f)
            }
        }
        .build()
        return _bxlFigma!!
    }

private var _bxlFigma: ImageVector? = null
