package com.woowla.compose.icon.collections.boxicons.boxicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.SolidGroup

public val SolidGroup.BxsTrain: ImageVector
    get() {
        if (_bxsTrain != null) {
            return _bxsTrain!!
        }
        _bxsTrain = Builder(name = "BxsTrain", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.375f, 2.0f)
                lineTo(7.621f, 2.0f)
                curveToRelative(-0.224f, 0.0f, -1.399f, 0.065f, -2.503f, 1.351f)
                curveTo(4.031f, 4.616f, 4.0f, 5.862f, 4.0f, 6.0f)
                verticalLineToRelative(11.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(1.0f)
                lineToRelative(-2.0f, 3.0f)
                horizontalLineToRelative(2.353f)
                lineToRelative(0.667f, -1.0f)
                horizontalLineToRelative(8.0f)
                lineToRelative(0.677f, 1.0f)
                lineTo(19.0f, 22.0f)
                lineToRelative(-2.0f, -3.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                lineTo(20.0f, 6.0f)
                curveToRelative(0.001f, -0.188f, -0.032f, -1.434f, -1.129f, -2.665f)
                curveTo(17.715f, 2.037f, 16.509f, 2.0f, 16.375f, 2.0f)
                close()
                moveTo(10.0f, 4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(10.0f, 4.0f)
                close()
                moveTo(7.5f, 17.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.001f, -3.001f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 7.5f, 17.0f)
                close()
                moveTo(16.5f, 17.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.001f, -3.001f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 16.5f, 17.0f)
                close()
                moveTo(18.0f, 12.0f)
                lineTo(6.0f, 12.0f)
                lineTo(6.0f, 8.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(4.0f)
                close()
            }
        }
        .build()
        return _bxsTrain!!
    }

private var _bxsTrain: ImageVector? = null
