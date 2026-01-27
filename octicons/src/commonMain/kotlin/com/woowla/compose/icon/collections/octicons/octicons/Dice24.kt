package com.woowla.compose.icon.collections.octicons.octicons

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
import com.woowla.compose.icon.collections.octicons.Octicons

public val Octicons.Dice24: ImageVector
    get() {
        if (_dice24 != null) {
            return _dice24!!
        }
        _dice24 = Builder(name = "Dice24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 3.75f)
                curveTo(2.0f, 2.784f, 2.784f, 2.0f, 3.75f, 2.0f)
                horizontalLineToRelative(16.5f)
                curveToRelative(0.966f, 0.0f, 1.75f, 0.784f, 1.75f, 1.75f)
                verticalLineToRelative(16.5f)
                curveToRelative(0.0f, 0.464f, -0.184f, 0.909f, -0.513f, 1.237f)
                arcTo(1.746f, 1.746f, 0.0f, false, true, 20.25f, 22.0f)
                lineTo(3.75f, 22.0f)
                curveToRelative(-0.464f, 0.0f, -0.909f, -0.184f, -1.237f, -0.513f)
                arcTo(1.746f, 1.746f, 0.0f, false, true, 2.0f, 20.25f)
                lineTo(2.0f, 3.75f)
                close()
                moveTo(3.75f, 3.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                verticalLineToRelative(16.5f)
                curveToRelative(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(16.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.25f, -0.25f)
                lineTo(20.5f, 3.75f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                lineTo(3.75f, 3.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 13.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -0.001f, -3.001f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 12.0f, 13.5f)
                close()
                moveTo(7.0f, 18.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -0.001f, -3.001f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 7.0f, 18.5f)
                close()
                moveTo(17.0f, 8.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -0.001f, -3.001f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 17.0f, 8.5f)
                close()
            }
        }
        .build()
        return _dice24!!
    }

private var _dice24: ImageVector? = null
