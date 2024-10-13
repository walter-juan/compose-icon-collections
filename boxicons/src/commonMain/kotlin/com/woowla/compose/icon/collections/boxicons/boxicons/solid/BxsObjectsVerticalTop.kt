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

public val SolidGroup.BxsObjectsVerticalTop: ImageVector
    get() {
        if (_bxsObjectsVerticalTop != null) {
            return _bxsObjectsVerticalTop!!
        }
        _bxsObjectsVerticalTop = Builder(name = "BxsObjectsVerticalTop", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 2.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 6.0f)
                lineTo(10.0f, 6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 11.0f, 7.0f)
                lineTo(11.0f, 21.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 10.0f, 22.0f)
                lineTo(6.0f, 22.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 5.0f, 21.0f)
                lineTo(5.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 6.0f, 6.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 6.0f)
                lineTo(18.0f, 6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 19.0f, 7.0f)
                lineTo(19.0f, 17.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 18.0f, 18.0f)
                lineTo(14.0f, 18.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.0f, 17.0f)
                lineTo(13.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 14.0f, 6.0f)
                close()
            }
        }
        .build()
        return _bxsObjectsVerticalTop!!
    }

private var _bxsObjectsVerticalTop: ImageVector? = null
