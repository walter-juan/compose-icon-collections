package com.woowla.compose.icon.collections.boxicons.boxicons.regular

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
import com.woowla.compose.icon.collections.boxicons.boxicons.RegularGroup

public val RegularGroup.BxUserCircle: ImageVector
    get() {
        if (_bxUserCircle != null) {
            return _bxUserCircle!!
        }
        _bxUserCircle = Builder(name = "BxUserCircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                arcTo(10.13f, 10.13f, 0.0f, false, false, 2.0f, 12.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 4.0f, 7.92f)
                lineTo(6.0f, 20.0f)
                horizontalLineToRelative(0.1f)
                arcToRelative(9.7f, 9.7f, 0.0f, false, false, 11.8f, 0.0f)
                horizontalLineToRelative(0.1f)
                verticalLineToRelative(-0.08f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 22.0f, 12.0f)
                arcTo(10.13f, 10.13f, 0.0f, false, false, 12.0f, 2.0f)
                close()
                moveTo(8.07f, 18.93f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 11.0f, 16.57f)
                horizontalLineToRelative(2.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 2.93f, 2.36f)
                arcToRelative(7.75f, 7.75f, 0.0f, false, true, -7.86f, 0.0f)
                close()
                moveTo(17.61f, 17.64f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 13.0f, 14.57f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -4.61f, 3.07f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 4.0f, 12.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 8.0f, -8.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 8.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -2.39f, 5.64f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 6.0f)
                arcToRelative(3.91f, 3.91f, 0.0f, false, false, -4.0f, 4.0f)
                arcToRelative(3.91f, 3.91f, 0.0f, false, false, 4.0f, 4.0f)
                arcToRelative(3.91f, 3.91f, 0.0f, false, false, 4.0f, -4.0f)
                arcToRelative(3.91f, 3.91f, 0.0f, false, false, -4.0f, -4.0f)
                close()
                moveTo(12.0f, 12.0f)
                arcToRelative(1.91f, 1.91f, 0.0f, false, true, -2.0f, -2.0f)
                arcToRelative(1.91f, 1.91f, 0.0f, false, true, 2.0f, -2.0f)
                arcToRelative(1.91f, 1.91f, 0.0f, false, true, 2.0f, 2.0f)
                arcToRelative(1.91f, 1.91f, 0.0f, false, true, -2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _bxUserCircle!!
    }

private var _bxUserCircle: ImageVector? = null
