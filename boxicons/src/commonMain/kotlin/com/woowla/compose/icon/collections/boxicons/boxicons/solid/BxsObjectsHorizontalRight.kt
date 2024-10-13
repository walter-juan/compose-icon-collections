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

public val SolidGroup.BxsObjectsHorizontalRight: ImageVector
    get() {
        if (_bxsObjectsHorizontalRight != null) {
            return _bxsObjectsHorizontalRight!!
        }
        _bxsObjectsHorizontalRight = Builder(name = "BxsObjectsHorizontalRight", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(20.0f)
                horizontalLineToRelative(-2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 13.0f)
                lineTo(17.0f, 13.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 18.0f, 14.0f)
                lineTo(18.0f, 18.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 17.0f, 19.0f)
                lineTo(3.0f, 19.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 2.0f, 18.0f)
                lineTo(2.0f, 14.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 13.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 5.0f)
                lineTo(17.0f, 5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 18.0f, 6.0f)
                lineTo(18.0f, 10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 17.0f, 11.0f)
                lineTo(7.0f, 11.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 6.0f, 10.0f)
                lineTo(6.0f, 6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 7.0f, 5.0f)
                close()
            }
        }
        .build()
        return _bxsObjectsHorizontalRight!!
    }

private var _bxsObjectsHorizontalRight: ImageVector? = null
