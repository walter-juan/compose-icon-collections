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

public val SolidGroup.BxsDirectionRight: ImageVector
    get() {
        if (_bxsDirectionRight != null) {
            return _bxsDirectionRight!!
        }
        _bxsDirectionRight = Builder(name = "BxsDirectionRight", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(2.295f, 12.707f)
                lineToRelative(8.978f, 9.0f)
                curveToRelative(0.389f, 0.39f, 1.025f, 0.391f, 1.414f, 0.002f)
                lineToRelative(9.021f, -9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -1.416f)
                lineToRelative(-9.021f, -9.0f)
                arcToRelative(0.999f, 0.999f, 0.0f, false, false, -1.414f, 0.002f)
                lineToRelative(-8.978f, 9.0f)
                arcToRelative(0.998f, 0.998f, 0.0f, false, false, 0.0f, 1.412f)
                close()
                moveTo(9.002f, 10.001f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-2.0f)
                lineToRelative(3.0f, 3.0f)
                lineToRelative(-3.0f, 3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-6.0f)
                close()
            }
        }
        .build()
        return _bxsDirectionRight!!
    }

private var _bxsDirectionRight: ImageVector? = null
