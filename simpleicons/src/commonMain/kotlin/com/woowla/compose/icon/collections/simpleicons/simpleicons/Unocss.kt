package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Unocss: ImageVector
    get() {
        if (_unocss != null) {
            return _unocss!!
        }
        _unocss = Builder(name = "Unocss", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.86f, 18.399f)
                curveToRelative(0.0f, -3.076f, 2.494f, -5.57f, 5.57f, -5.57f)
                reflectiveCurveTo(24.0f, 15.323f, 24.0f, 18.399f)
                curveToRelative(0.0f, 3.076f, -2.494f, 5.57f, -5.57f, 5.57f)
                reflectiveCurveToRelative(-5.57f, -2.494f, -5.57f, -5.57f)
                close()
                moveTo(12.86f, 5.601f)
                curveToRelative(0.0f, -3.076f, 2.494f, -5.57f, 5.57f, -5.57f)
                reflectiveCurveTo(24.0f, 2.525f, 24.0f, 5.601f)
                verticalLineToRelative(5.013f)
                arcToRelative(0.557f, 0.557f, 0.0f, false, true, -0.557f, 0.557f)
                horizontalLineTo(13.417f)
                arcToRelative(0.557f, 0.557f, 0.0f, false, true, -0.557f, -0.557f)
                verticalLineToRelative(-5.013f)
                close()
                moveTo(11.14f, 18.399f)
                curveToRelative(0.0f, 3.076f, -2.494f, 5.57f, -5.57f, 5.57f)
                curveTo(2.494f, 23.969f, 0.0f, 21.475f, 0.0f, 18.399f)
                verticalLineToRelative(-5.013f)
                arcToRelative(0.557f, 0.557f, 0.0f, false, true, 0.557f, -0.557f)
                horizontalLineToRelative(10.026f)
                arcToRelative(0.557f, 0.557f, 0.0f, false, true, 0.557f, 0.557f)
                verticalLineToRelative(5.013f)
                close()
            }
        }
        .build()
        return _unocss!!
    }

private var _unocss: ImageVector? = null
