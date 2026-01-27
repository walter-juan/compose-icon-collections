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

public val Octicons.Space24: ImageVector
    get() {
        if (_space24 != null) {
            return _space24!!
        }
        _space24 = Builder(name = "Space24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.831f, 13.621f)
                arcToRelative(0.337f, 0.337f, 0.0f, false, true, 0.633f, 0.0f)
                lineToRelative(0.322f, 0.88f)
                arcToRelative(5.052f, 5.052f, 0.0f, false, false, 3.008f, 3.008f)
                lineToRelative(0.88f, 0.322f)
                arcToRelative(0.337f, 0.337f, 0.0f, false, true, 0.0f, 0.633f)
                lineToRelative(-0.88f, 0.322f)
                arcToRelative(5.054f, 5.054f, 0.0f, false, false, -3.008f, 3.008f)
                lineToRelative(-0.322f, 0.88f)
                arcToRelative(0.337f, 0.337f, 0.0f, false, true, -0.633f, 0.0f)
                lineToRelative(-0.322f, -0.88f)
                arcToRelative(5.054f, 5.054f, 0.0f, false, false, -3.008f, -3.008f)
                lineToRelative(-0.88f, -0.322f)
                arcToRelative(0.337f, 0.337f, 0.0f, false, true, 0.0f, -0.633f)
                lineToRelative(0.88f, -0.322f)
                arcToRelative(5.052f, 5.052f, 0.0f, false, false, 3.008f, -3.008f)
                lineToRelative(0.322f, -0.88f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 19.25f)
                verticalLineTo(4.75f)
                curveTo(2.0f, 3.784f, 2.784f, 3.0f, 3.75f, 3.0f)
                horizontalLineToRelative(4.971f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, 1.447f, 0.765f)
                lineToRelative(1.404f, 2.063f)
                curveToRelative(0.047f, 0.069f, 0.125f, 0.11f, 0.207f, 0.11f)
                horizontalLineToRelative(8.471f)
                curveToRelative(0.966f, 0.0f, 1.75f, 0.783f, 1.75f, 1.75f)
                verticalLineToRelative(5.781f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineTo(7.688f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                horizontalLineToRelative(-8.471f)
                arcToRelative(1.753f, 1.753f, 0.0f, false, true, -1.447f, -0.765f)
                lineTo(8.928f, 4.609f)
                arcToRelative(0.253f, 0.253f, 0.0f, false, false, -0.207f, -0.109f)
                horizontalLineTo(3.75f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                verticalLineToRelative(14.5f)
                curveToRelative(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                horizontalLineTo(12.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineTo(3.75f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 2.0f, 19.25f)
                close()
            }
        }
        .build()
        return _space24!!
    }

private var _space24: ImageVector? = null
