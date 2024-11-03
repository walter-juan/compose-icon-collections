package com.woowla.compose.icon.collections.twbs.twbs

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
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.RSquareFill: ImageVector
    get() {
        if (_rSquareFill != null) {
            return _rSquareFill!!
        }
        _rSquareFill = Builder(name = "RSquareFill", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.835f, 5.092f)
                verticalLineToRelative(2.777f)
                horizontalLineToRelative(1.549f)
                curveToRelative(0.995f, 0.0f, 1.573f, -0.463f, 1.573f, -1.36f)
                curveToRelative(0.0f, -0.913f, -0.596f, -1.417f, -1.537f, -1.417f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                lineTo(16.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                close()
                moveTo(5.5f, 4.002f)
                horizontalLineToRelative(3.11f)
                curveToRelative(1.71f, 0.0f, 2.741f, 0.973f, 2.741f, 2.46f)
                curveToRelative(0.0f, 1.138f, -0.667f, 1.94f, -1.495f, 2.24f)
                lineTo(11.5f, 12.0f)
                lineTo(9.98f, 12.0f)
                lineTo(8.52f, 8.924f)
                lineTo(6.836f, 8.924f)
                lineTo(6.836f, 12.0f)
                lineTo(5.5f, 12.0f)
                close()
            }
        }
        .build()
        return _rSquareFill!!
    }

private var _rSquareFill: ImageVector? = null
