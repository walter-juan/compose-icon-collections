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

public val RegularGroup.BxTrain: ImageVector
    get() {
        if (_bxTrain != null) {
            return _bxTrain!!
        }
        _bxTrain = Builder(name = "BxTrain", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 14.5f)
                moveToRelative(-1.5f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5f, 14.5f)
                moveToRelative(-1.5f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.87f, 3.34f)
                arcTo(3.55f, 3.55f, 0.0f, false, false, 16.38f, 2.0f)
                lineTo(7.62f, 2.0f)
                arcToRelative(3.47f, 3.47f, 0.0f, false, false, -2.5f, 1.35f)
                arcTo(4.32f, 4.32f, 0.0f, false, false, 4.0f, 6.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                lineToRelative(-2.0f, 3.0f)
                horizontalLineToRelative(2.32f)
                lineTo(8.0f, 21.0f)
                horizontalLineToRelative(8.0f)
                lineToRelative(0.68f, 1.0f)
                lineTo(19.0f, 22.0f)
                lineToRelative(-2.0f, -3.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                lineTo(20.0f, 6.0f)
                arcToRelative(4.15f, 4.15f, 0.0f, false, false, -1.13f, -2.66f)
                close()
                moveTo(7.62f, 4.0f)
                horizontalLineToRelative(8.72f)
                arcToRelative(1.77f, 1.77f, 0.0f, false, true, 1.0f, 0.66f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, 0.25f, 0.34f)
                lineTo(6.39f, 5.0f)
                arcToRelative(2.3f, 2.3f, 0.0f, false, true, 0.25f, -0.35f)
                arcTo(1.65f, 1.65f, 0.0f, false, true, 7.62f, 4.0f)
                close()
                moveTo(6.0f, 8.0f)
                lineTo(6.0f, 7.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(3.0f)
                lineTo(6.0f, 10.0f)
                close()
                moveTo(18.0f, 17.0f)
                lineTo(6.0f, 17.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(12.0f)
                close()
            }
        }
        .build()
        return _bxTrain!!
    }

private var _bxTrain: ImageVector? = null
