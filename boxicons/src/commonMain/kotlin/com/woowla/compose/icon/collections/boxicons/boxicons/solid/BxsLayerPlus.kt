package com.woowla.compose.icon.collections.boxicons.boxicons.solid

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
import com.woowla.compose.icon.collections.boxicons.boxicons.SolidGroup

public val SolidGroup.BxsLayerPlus: ImageVector
    get() {
        if (_bxsLayerPlus != null) {
            return _bxsLayerPlus!!
        }
        _bxsLayerPlus = Builder(name = "BxsLayerPlus", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(2.513f, 12.833f)
                lineToRelative(9.022f, 5.04f)
                arcToRelative(0.995f, 0.995f, 0.0f, false, false, 0.973f, 0.001f)
                lineToRelative(8.978f, -5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.002f, -1.749f)
                lineToRelative(-9.022f, -5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.968f, -0.001f)
                lineToRelative(-8.978f, 4.96f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.003f, 1.749f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(3.485f, 15.126f)
                lineToRelative(-0.971f, 1.748f)
                lineToRelative(9.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.971f, 0.0f)
                lineToRelative(9.0f, -5.0f)
                lineToRelative(-0.971f, -1.748f)
                lineTo(12.0f, 19.856f)
                lineToRelative(-8.515f, -4.73f)
                close()
                moveTo(20.0f, 8.0f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _bxsLayerPlus!!
    }

private var _bxsLayerPlus: ImageVector? = null
