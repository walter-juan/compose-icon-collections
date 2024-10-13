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

public val LogosGroup.BxlTripAdvisor: ImageVector
    get() {
        if (_bxlTripAdvisor != null) {
            return _bxlTripAdvisor!!
        }
        _bxlTripAdvisor = Builder(name = "BxlTripAdvisor", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.31f, 10.28f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 2.5f, 2.49f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -2.5f, -2.49f)
                close()
                moveTo(8.31f, 14.08f)
                arcToRelative(1.31f, 1.31f, 0.0f, true, true, 0.0f, -2.61f)
                arcToRelative(1.31f, 1.31f, 0.0f, true, true, 0.0f, 2.61f)
                close()
                moveTo(15.69f, 10.28f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 2.5f, 2.49f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -2.5f, -2.49f)
                close()
                moveTo(17.0f, 12.77f)
                arcToRelative(1.31f, 1.31f, 0.0f, true, true, -1.31f, -1.3f)
                arcToRelative(1.31f, 1.31f, 0.0f, false, true, 1.31f, 1.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, 10.0f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 12.0f, 2.0f)
                close()
                moveTo(19.38f, 12.77f)
                arcToRelative(3.69f, 3.69f, 0.0f, false, true, -6.2f, 2.71f)
                lineTo(12.0f, 16.77f)
                lineToRelative(-1.18f, -1.29f)
                arcToRelative(3.69f, 3.69f, 0.0f, true, true, -5.0f, -5.44f)
                lineToRelative(-1.2f, -1.3f)
                lineTo(7.3f, 8.74f)
                arcToRelative(8.33f, 8.33f, 0.0f, false, true, 9.41f, 0.0f)
                horizontalLineToRelative(2.67f)
                lineToRelative(-1.2f, 1.31f)
                arcToRelative(3.71f, 3.71f, 0.0f, false, true, 1.2f, 2.72f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.77f, 9.05f)
                arcToRelative(7.19f, 7.19f, 0.0f, false, false, -5.54f, 0.0f)
                arcTo(4.06f, 4.06f, 0.0f, false, true, 12.0f, 12.7f)
                arcToRelative(4.08f, 4.08f, 0.0f, false, true, 2.77f, -3.65f)
                close()
            }
        }
        .build()
        return _bxlTripAdvisor!!
    }

private var _bxlTripAdvisor: ImageVector? = null
